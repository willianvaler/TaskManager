package wav.com.taskmanager.wav.com.taskmanager.cmn.daos;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by willian on 17/07/17.
 */

public class TaskDao
{

    public JSONObject getAllTasks( InputStream is) throws JSONException {
        String json = "";

        try
        {
            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        }

        catch (IOException ex)
        {
            ex.printStackTrace();
        }

        return new JSONObject(json);
    }
}
