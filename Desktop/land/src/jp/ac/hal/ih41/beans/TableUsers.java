
package jp.ac.hal.ih41.beans;

import java.io.Serializable;

/**
 *
 * @author kiaamaaio
 */
public class TableUsers implements Serializable {
    
       private static final long serialVersionUID = 1L;
       
       private String usersId;
       private String usersPassword;
       private String usersName;

    /**
     * @return the usersId
     */
    public String getUsersId() {
        return usersId;
    }

    /**
     * @param usersId the usersId to set
     */
    public void setUsersId(String usersId) {
        this.usersId = usersId;
    }

    /**
     * @return the usersPassword
     */
    public String getUsersPassword() {
        return usersPassword;
    }

    /**
     * @param usersPassword the usersPassword to set
     */
    public void setUsersPassword(String usersPassword) {
        this.usersPassword = usersPassword;
    }

    /**
     * @return the usersName
     */
    public String getUsersName() {
        return usersName;
    }

    /**
     * @param usersName the usersName to set
     */
    public void setUsersName(String usersName) {
        this.usersName = usersName;
    }
       
       
}
