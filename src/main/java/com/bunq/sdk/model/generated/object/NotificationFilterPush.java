package com.bunq.sdk.model.generated.object;

import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;

/**
 */
public class NotificationFilterPush extends BunqModel {

  /**
   * The notification category that will match this notification filter.
   */
  @Expose
  @SerializedName("category")
  private String category;

  /**
   * The notification category that will match this notification filter.
   */
  @Expose
  @SerializedName("category_field_for_request")
  private String categoryFieldForRequest;

  public NotificationFilterPush() {
    this(null);
  }

  public NotificationFilterPush(String category) {
    this.categoryFieldForRequest = category;
  }

  /**
   */
  public static NotificationFilterPush fromJsonReader(JsonReader reader) {
    return fromJsonReader(NotificationFilterPush.class, reader);
  }

  /**
   * The notification category that will match this notification filter.
   */
  public String getCategory() {
    return this.category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   */
  public boolean isAllFieldNull() {
    if (this.category != null) {
      return false;
    }

    return true;
  }

}
