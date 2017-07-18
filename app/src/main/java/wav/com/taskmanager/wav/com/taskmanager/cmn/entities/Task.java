package wav.com.taskmanager.wav.com.taskmanager.cmn.entities;

/**
 * Created by willian on 17/07/17.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Task
{
    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("type")
    @Expose
    private int type;//dayle, normal...

    @SerializedName("name")
    @Expose
    private String name;

    //1 - Insignificant,
    //2 - Easy,
    //3 - Normal
    //4 - Hard
    //5 - Legendary
    @SerializedName("difficulty")
    @Expose
    private int difficulty;

    @SerializedName("objectiveID")
    @Expose
    private int objectiveId;

    @SerializedName("strategyId")
    @Expose
    private int strategyId;

    @SerializedName("modelID")
    @Expose
    private int modelId;

    /**
     *
     * @return
     */
    public int getId(){ return id; }

    /**
     *
     * @param id
     */
    public void setId(int id){ this.id = id; }

    /**
     *
     * @return
     */
    public int getType(){ return type; }

    /**
     *
     * @param type
     */
    public void setType(int type){ this.type = type; }

    /**
     *
     * @return
     */
    public String getName(){ return name; }

    /**
     *
     * @param name
     */
    public void setName(String name){ this.name = name; }

    /**
     *
     * @return
     */
    public int getDifficulty(){ return difficulty; }

    /**
     *
     * @param difficulty
     */
    public void setDifficulty(int difficulty){ this.difficulty = difficulty; }

    /**
     *
     * @return
     */
    public int getObjectiveId(){ return objectiveId; }

    /**
     *
     * @param objectiveId
     */
    public void setObjectiveId(int objectiveId){ this.objectiveId = objectiveId; }

    /**
     *
     * @return
     */
    public int getStrategyId(){ return strategyId; }

    /**
     *
     * @param strategyId
     */
    public void setStrategyId(int strategyId){ this.strategyId = strategyId; }

    /**
     *
     * @return
     */
    public int getModelId(){ return modelId; }

    /**
     *
     * @param modelId
     */
    public void setModelId(int modelId){ this.modelId = modelId; }
}
