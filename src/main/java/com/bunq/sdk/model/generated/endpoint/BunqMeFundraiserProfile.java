package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.bunq.sdk.model.generated.object.AttachmentPublic;
import com.bunq.sdk.model.generated.object.LabelMonetaryAccount;
import com.bunq.sdk.model.generated.object.Pointer;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * bunq.me public profile of the user.
 */
public class BunqMeFundraiserProfile extends BunqModel {

  /**
   * Field constants.
   */
  public static final String FIELD_POINTER = "pointer";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "BunqMeFundraiserProfileModel";

  /**
   * The color chosen for the bunq.me fundraiser profile in hexadecimal format.
   */
  @Expose
  @SerializedName("color")
  private String color;

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("alias")
  private MonetaryAccountReference alias;

  /**
   * The description of the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("description")
  private String description;

  /**
   * The attachments attached to the fundraiser profile.
   */
  @Expose
  @SerializedName("attachment")
  private List<AttachmentPublic> attachment;

  /**
   * The pointer (url) which will be used to access the bunq.me fundraiser profile.
   */
  @Expose
  @SerializedName("pointer")
  private MonetaryAccountReference pointer;

  /**
   * The status of the bunq.me fundraiser profile, can be ACTIVE or DEACTIVATED.
   */
  @Expose
  @SerializedName("status")
  private String status;

  /**
   * The URL which the user is sent to when a payment is completed.
   */
  @Expose
  @SerializedName("redirect_url")
  private String redirectUrl;

  /**
   * The color chosen for the bunq.me fundraiser profile in hexadecimal format.
   */
  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  /**
   * The LabelMonetaryAccount with the public information of the User and the MonetaryAccount that
   * created the bunq.me fundraiser profile.
   */
  public MonetaryAccountReference getAlias() {
    return this.alias;
  }

  public void setAlias(MonetaryAccountReference alias) {
    this.alias = alias;
  }

  /**
   * The description of the bunq.me fundraiser profile.
   */
  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The attachments attached to the fundraiser profile.
   */
  public List<AttachmentPublic> getAttachment() {
    return this.attachment;
  }

  public void setAttachment(List<AttachmentPublic> attachment) {
    this.attachment = attachment;
  }

  /**
   * The pointer (url) which will be used to access the bunq.me fundraiser profile.
   */
  public MonetaryAccountReference getPointer() {
    return this.pointer;
  }

  public void setPointer(MonetaryAccountReference pointer) {
    this.pointer = pointer;
  }

  /**
   * The status of the bunq.me fundraiser profile, can be ACTIVE or DEACTIVATED.
   */
  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * The URL which the user is sent to when a payment is completed.
   */
  public String getRedirectUrl() {
    return this.redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  /**
   */
  public boolean areAllFieldNull() {
    if (this.color != null) {
      return false;
    }

    if (this.alias != null) {
      return false;
    }

    if (this.description != null) {
      return false;
    }

    if (this.attachment != null) {
      return false;
    }

    if (this.pointer != null) {
      return false;
    }

    if (this.status != null) {
      return false;
    }

    if (this.redirectUrl != null) {
      return false;
    }

    return true;
  }

}
