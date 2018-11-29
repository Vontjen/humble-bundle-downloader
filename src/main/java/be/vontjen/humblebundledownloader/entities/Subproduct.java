
package be.vontjen.humblebundledownloader.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


/**
 * The Items Schema
 * <p>
 */
public class Subproduct {

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
     * The Url Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("url")
    @Expose
    private String url = "";
    /**
     * The Downloads Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("downloads")
    @Expose
    private List<Object> downloads = new ArrayList<Object>();
    /**
     * The Library_family_name Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("library_family_name")
    @Expose
    private String libraryFamilyName = "";
    /**
     * The Payee Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("payee")
    @Expose
    private Payee payee;
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
     * The Custom_download_page_box_html Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("custom_download_page_box_html")
    @Expose
    private String customDownloadPageBoxHtml = "";
    /**
     * The Icon Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("icon")
    @Expose
    private Object icon = null;

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

    /**
     * The Url Schema
     * <p>
     * <p>
     * (Required)
     */
    public String getUrl() {
        return url;
    }

    /**
     * The Url Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * The Downloads Schema
     * <p>
     * <p>
     * (Required)
     */
    public List<Object> getDownloads() {
        return downloads;
    }

    /**
     * The Downloads Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setDownloads(List<Object> downloads) {
        this.downloads = downloads;
    }

    /**
     * The Library_family_name Schema
     * <p>
     * <p>
     * (Required)
     */
    public String getLibraryFamilyName() {
        return libraryFamilyName;
    }

    /**
     * The Library_family_name Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setLibraryFamilyName(String libraryFamilyName) {
        this.libraryFamilyName = libraryFamilyName;
    }

    /**
     * The Payee Schema
     * <p>
     * <p>
     * (Required)
     */
    public Payee getPayee() {
        return payee;
    }

    /**
     * The Payee Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setPayee(Payee payee) {
        this.payee = payee;
    }

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
     * The Custom_download_page_box_html Schema
     * <p>
     * <p>
     * (Required)
     */
    public String getCustomDownloadPageBoxHtml() {
        return customDownloadPageBoxHtml;
    }

    /**
     * The Custom_download_page_box_html Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setCustomDownloadPageBoxHtml(String customDownloadPageBoxHtml) {
        this.customDownloadPageBoxHtml = customDownloadPageBoxHtml;
    }

    /**
     * The Icon Schema
     * <p>
     * <p>
     * (Required)
     */
    public Object getIcon() {
        return icon;
    }

    /**
     * The Icon Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setIcon(Object icon) {
        this.icon = icon;
    }

}
