package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import org.apache.commons.lang3.SerializationUtils;

/**
 *
 * @author tungnguyen
 */
public class TokenTool {
    
    private static final String tokenDir = ".config/walletjava/credential";
    
    /**
     * Save token to file
     * @param token data have type of HashMap<String, String>
     * @return true if save action is successful, false if not
     */
    public static boolean saveToken(HashMap<String, String> token) {
        boolean isSaveSuccess = false;
        File outFile = null;
        FileOutputStream out = null;
        try {
            outFile = new File(tokenDir);
            if (!outFile.exists()) {
                try {                    
                    outFile.mkdirs();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            out = new FileOutputStream(tokenDir + "/token");
            
            byte[] bytes = SerializationUtils.serialize(token);
            
            out.write(bytes);
            out.flush();
            out.close();
            isSaveSuccess = true;
        } catch (Exception e) {
            out = null;
            isSaveSuccess = false;
            e.printStackTrace();
        }
        return isSaveSuccess;
    }
    
    /**
     * Get token from file
     * @return token if get action is successful, null if not
     */
    public static HashMap<String, String> getToken() {
        HashMap<String, String> token = null;
        File tokenFile = null;
        FileInputStream in = null;
        
        try {
            tokenFile = new File(tokenDir + "/token");
            in = new FileInputStream(tokenFile);
            
            byte[] bytes = new byte[(int)tokenFile.length()];
            in.read(bytes);
            
            token = SerializationUtils.deserialize(bytes);

            in.close();
        } catch (Exception e) {
            token = null;
            e.printStackTrace();
        }
        
        return token;
    }
    
    /**
     * Delete file contains token
     * @return true if delete is successful, false if not
     */
    public static boolean deleteToken() {
        boolean isDeleteSuccess = false;
        File tokenFile = null;
        
        try {
            tokenFile = new File(tokenDir + "/token");
            if (tokenFile.delete()) {
                isDeleteSuccess = true;
            } else {
                isDeleteSuccess = false;
            }
        } catch (Exception e) {
            isDeleteSuccess = false;
            e.printStackTrace();
        }
        
        return isDeleteSuccess;
    }
    
}
