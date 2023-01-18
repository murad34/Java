package Files;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L; //file yazib ve ya oxuyanda versianUID olur ve onlar chechk olunur
    //sabah birisi gun nese elave elesey buraya, filedan yenede oxumag ve yazmag olsum bu deyishiklere baxmayarag, serialVersionUID eyni olmalidi

    public String name;

    public transient String password;

}
