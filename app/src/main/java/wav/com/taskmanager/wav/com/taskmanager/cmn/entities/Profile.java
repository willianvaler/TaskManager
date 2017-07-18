package wav.com.taskmanager.wav.com.taskmanager.cmn.entities;

/**
 * Created by willian on 17/07/17.
 */

public class Profile
{
    private String name;
    private String classType;
    private String gender;
    private int level;
    private int experince;

    /**
     *
     * @return
     */
    public String getName()
    {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getClassType()
    {
        return classType;
    }

    /**
     *
     * @param classType
     */
    public void setClassType(String classType)
    {
        this.classType = classType;
    }

    /**
     *
     * @return
     */
    public String getGender()
    {
        return gender;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    /**
     *
     * @return
     */
    public int getLevel()
    {
        return level;
    }

    /**
     *
     * @param level
     */
    public void setLevel(int level)
    {
        this.level = level;
    }

    /**
     *
     * @return
     */
    public int getExperince()
    {
        return experince;
    }

    /**
     *
     * @param experince
     */
    public void setExperince(int experince)
    {
        this.experince = experince;
    }
}
