package main;

import java.util.Date;
import java.util.DuplicateFormatFlagsException;

public class UserCreateInteractor implements IUserCreateUseCase {
    private IUserRepository userRepository;
    private IUserCreatePresenter presenter;

    public UserCreateInteractor(IUserRepository userRepository, IUserCreatePresenter presenter) {
        this.userRepository = userRepository;
        this.presenter = presenter;
    }

    public void Handle(UserCreateInputData inputData) {
        String userName = inputData.userName;
        var duplicateUser = userRepository.FindByUserName(userName);
        if (duplicateUser != null) {
            return;
        }

        var user = new User(userName);
        userRepository.Save(user);

        var outputData = new UserCreateOutputData(user.userName, new Date());
        presenter.Complete(outputData);
    }
}
