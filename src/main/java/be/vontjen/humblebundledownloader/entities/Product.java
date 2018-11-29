
package be.vontjen.humblebundledownloader.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * The Product Schema
 * <p>
 */
public class Product {

    /**
     * The Category Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("category")
    @Expose
    private String category = "";
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
     * The Empty_tpkds Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("empty_tpkds")
    @Expose
    private EmptyTpkds emptyTpkds;
    /**
     * The Post_purchase_text Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("post_purchase_text")
    @Expose
    private String postPurchaseText = "";
    /**
     * The Supports_canonical Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("supports_canonical")
    @Expose
    private boolean supportsCanonical = false;
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
     * The Partial_gift_enabled Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("partial_gift_enabled")
    @Expose
    private boolean partialGiftEnabled = false;

    /**
     * The Category Schema
     * <p>
     * <p>
     * (Required)
     */
    public String getCategory() {
        return category;
    }

    /**
     * The Category Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setCategory(String category) {
        this.category = category;
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

    /**
     * The Empty_tpkds Schema
     * <p>
     * <p>
     * (Required)
     */
    public EmptyTpkds getEmptyTpkds() {
        return emptyTpkds;
    }

    /**
     * The Empty_tpkds Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setEmptyTpkds(EmptyTpkds emptyTpkds) {
        this.emptyTpkds = emptyTpkds;
    }

    /**
     * The Post_purchase_text Schema
     * <p>
     * <p>
     * (Required)
     */
    public String getPostPurchaseText() {
        return postPurchaseText;
    }

    /**
     * The Post_purchase_text Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setPostPurchaseText(String postPurchaseText) {
        this.postPurchaseText = postPurchaseText;
    }

    /**
     * The Supports_canonical Schema
     * <p>
     * <p>
     * (Required)
     */
    public boolean isSupportsCanonical() {
        return supportsCanonical;
    }

    /**
     * The Supports_canonical Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setSupportsCanonical(boolean supportsCanonical) {
        this.supportsCanonical = supportsCanonical;
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
     * The Partial_gift_enabled Schema
     * <p>
     * <p>
     * (Required)
     */
    public boolean isPartialGiftEnabled() {
        return partialGiftEnabled;
    }

    /**
     * The Partial_gift_enabled Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setPartialGiftEnabled(boolean partialGiftEnabled) {
        this.partialGiftEnabled = partialGiftEnabled;
    }

}
