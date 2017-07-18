package wav.com.taskmanager.wav.com.taskmanager.cmn.daos;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.annotation.Nullable;
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


}
