package wav.com.taskmanager.wav.com.taskmanager.cmn.entities;

/**
 * Created by willian on 17/07/17.
 */

public class Task
{
    private int id;
    private int type;//dayle, normal...
    private String name;
    //1 - Insignificant,
    //2 - Easy,
    //3 - Normal
    //4 - Hard
    //5 - Legendary
    private int difficulty;
    private int objectiveId;
    private int strategyId;
}
