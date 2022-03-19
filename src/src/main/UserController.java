package main;

public class UserController {
    private IUserCreateUseCase userCreateUseCase;

    public UserController(IUserCreateUseCase userCreateUseCase) {
        this.userCreateUseCase = userCreateUseCase;
    }

    public void CreateUser(String userName) {
        var inputData = new UserCreateInputData(userName);
        userCreateUseCase.Handle(inputData);
    }
}
