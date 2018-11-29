
package be.vontjen.humblebundledownloader.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;


/**
 * The Root Schema
 * <p>
 */
public class HumbleOrders {

    /**
     * The Amount_spent Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("amount_spent")
    @Expose
    private long amountSpent = 0L;
    /**
     * The Product Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("product")
    @Expose
    private Product product;
    /**
     * The Gamekey Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("gamekey")
    @Expose
    private String gamekey = "";
    /**
     * The Uid Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("uid")
    @Expose
    private String uid = "";
    /**
     * The Created Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("created")
    @Expose
    private String created = "";
    /**
     * The Missed_credit Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("missed_credit")
    @Expose
    private Object missedCredit = null;
    /**
     * The Subproducts Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("subproducts")
    @Expose
    private List<Subproduct> subproducts = new ArrayList<Subproduct>();
    /**
     * The Currency Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("currency")
    @Expose
    private String currency = "";
    /**
     * The Is_giftee Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("is_giftee")
    @Expose
    private boolean isGiftee = false;
    /**
     * The Claimed Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("claimed")
    @Expose
    private boolean claimed = false;
    /**
     * The Total Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("total")
    @Expose
    private long total = 0L;
    /**
     * The Path_ids Schema
     * <p>
     * <p>
     * (Required)
     */
    @SerializedName("path_ids")
    @Expose
    private List<String> pathIds = new ArrayList<String>();

    /**
     * The Amount_spent Schema
     * <p>
     * <p>
     * (Required)
     */
    public long getAmountSpent() {
        return amountSpent;
    }

    /**
     * The Amount_spent Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setAmountSpent(long amountSpent) {
        this.amountSpent = amountSpent;
    }

    /**
     * The Product Schema
     * <p>
     * <p>
     * (Required)
     */
    public Product getProduct() {
        return product;
    }

    /**
     * The Product Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * The Gamekey Schema
     * <p>
     * <p>
     * (Required)
     */
    public String getGamekey() {
        return gamekey;
    }

    /**
     * The Gamekey Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setGamekey(String gamekey) {
        this.gamekey = gamekey;
    }

    /**
     * The Uid Schema
     * <p>
     * <p>
     * (Required)
     */
    public String getUid() {
        return uid;
    }

    /**
     * The Uid Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setUid(String uid) {
        this.uid = uid;
    }

    /**
     * The Created Schema
     * <p>
     * <p>
     * (Required)
     */
    public String getCreated() {
        return created;
    }

    /**
     * The Created Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * The Missed_credit Schema
     * <p>
     * <p>
     * (Required)
     */
    public Object getMissedCredit() {
        return missedCredit;
    }

    /**
     * The Missed_credit Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setMissedCredit(Object missedCredit) {
        this.missedCredit = missedCredit;
    }

    /**
     * The Subproducts Schema
     * <p>
     * <p>
     * (Required)
     */
    public List<Subproduct> getSubproducts() {
        return subproducts;
    }

    /**
     * The Subproducts Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setSubproducts(List<Subproduct> subproducts) {
        this.subproducts = subproducts;
    }

    /**
     * The Currency Schema
     * <p>
     * <p>
     * (Required)
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * The Currency Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * The Is_giftee Schema
     * <p>
     * <p>
     * (Required)
     */
    public boolean isIsGiftee() {
        return isGiftee;
    }

    /**
     * The Is_giftee Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setIsGiftee(boolean isGiftee) {
        this.isGiftee = isGiftee;
    }

    /**
     * The Claimed Schema
     * <p>
     * <p>
     * (Required)
     */
    public boolean isClaimed() {
        return claimed;
    }

    /**
     * The Claimed Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setClaimed(boolean claimed) {
        this.claimed = claimed;
    }

    /**
     * The Total Schema
     * <p>
     * <p>
     * (Required)
     */
    public long getTotal() {
        return total;
    }

    /**
     * The Total Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setTotal(long total) {
        this.total = total;
    }

    /**
     * The Path_ids Schema
     * <p>
     * <p>
     * (Required)
     */
    public List<String> getPathIds() {
        return pathIds;
    }

    /**
     * The Path_ids Schema
     * <p>
     * <p>
     * (Required)
     */
    public void setPathIds(List<String> pathIds) {
        this.pathIds = pathIds;
    }

}
