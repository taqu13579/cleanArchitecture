package main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemBUserCreatePresenter implements IUserCreatePresenter {
    public void Complete(UserCreateOutputData outputData) {
        String userId = outputData.userId;
        Date createdDate = outputData.created;
        String createdDateText = new SimpleDateFormat("yyyy年MM月dd日").format(createdDate);
        var model = new UserCreateViewModel(userId, createdDateText);
        System.out.println(String.format("id:%s, created:%s", model.userId, model.createDate));
    }
}
