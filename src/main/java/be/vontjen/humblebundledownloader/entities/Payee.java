
package be.vontjen.humblebundledownloader.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Payee Schema
 * <p>
 */
public class Payee {

    /**
     * The Human_name Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("human_name")
    @Expose
    private String humanName = "";
    /**
     * The Machine_name Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("machine_name")
    @Expose
    private String machineName = "";

    /**
     * The Human_name Schema
     * <p>
     * <p>
     * (Required)
     */
    public String getHumanName() {
        return humanName;
    }

    /**
     * The Human_name Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    /**
     * The Machine_name Schema
     * <p>
     * <p>
     * (Required)
     */
    public String getMachineName() {
        return machineName;
    }

    /**
     * The Machine_name Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

}
