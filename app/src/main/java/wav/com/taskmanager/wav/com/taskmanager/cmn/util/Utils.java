package wav.com.taskmanager.wav.com.taskmanager.cmn.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by willian on 17/07/17.
 */

public class Utils
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


    /**
     *
     * @param context
     * @return
     */
    @Nullable
    public static <T> List<T> loadAllFromJson(Context context, Class<? extends T> clazz, String jsonName ){
        try
        {
            GsonBuilder builder = new GsonBuilder();

            Gson gson = builder.create();

            JSONArray array = new JSONArray( loadJSONFromAsset( context, jsonName ) );

            ArrayList<T> list = new ArrayList<>();

            for(int i=0;i<array.length();i++)
            {
                T o = gson.fromJson( array.getString(i), clazz );
                list.add( o );
            }

            return list;
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
