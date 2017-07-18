package wav.com.taskmanager.wav.com.taskmanager.cmn.daos;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import wav.com.taskmanager.wav.com.taskmanager.cmn.entities.Task;

/**
 * Created by willian on 17/07/17.
 */

public class TaskDao
{
    private static final String TAG = "TaskDao";


    /**
     * se usar json.put("name","wav"); ele sobrescreve o valor que estiver no atributo name
     *
     Remove key and then add again the modified key, value pair as shown below :

     JSONObject js = new JSONObject();
     js.put("name", "rai");

     js.remove("name");
     js.put("name", "abc");
     */

    public static JSONObject getAllTasks( InputStream is) throws JSONException
    {
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
            return null;
        }

        return new JSONObject(json);
    }

    /**
     *
     * @param context
     * @return
     */
    public static List<Task> loadAllTasks( Context context ){
        try
        {
            GsonBuilder builder = new GsonBuilder();

            Gson gson = builder.create();

            JSONArray array = new JSONArray( loadJSONFromAsset( context, "tasks.json" ) );

            List<Task> taskList = new ArrayList<>();

            for(int i=0;i<array.length();i++)
            {
                Task task = gson.fromJson( array.getString(i), Task.class );
                taskList.add( task );
            }

            return taskList;
        }

        catch (Exception e)
        {
            e.printStackTrace();

            return null;
        }
    }

    /**
     *
     * @param context
     * @param jsonFileName
     * @return
     */
    private static String loadJSONFromAsset( Context context, String jsonFileName )
    {
        String json = null;
        InputStream is = null;

        try
        {
            AssetManager manager = context.getAssets();

            Log.d(TAG,"path "+ jsonFileName);

            is = manager.open( jsonFileName );

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");
        }

        catch (IOException ex)
        {
            ex.printStackTrace();
            return null;
        }

        return json;
    }
}
