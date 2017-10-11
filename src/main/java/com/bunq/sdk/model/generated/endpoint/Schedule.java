package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.context.ApiContext;
import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.bunq.sdk.model.core.MonetaryAccountReference;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.lang.model.type.NullType;

/**
 * view for reading the scheduled definitions.
 */
public class Schedule extends BunqModel {

  /**
   * Endpoint constants.
   */
  private static final String ENDPOINT_URL_READ = "user/%s/monetary-account/%s/schedule/%s";
  private static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/schedule";

  /**
   * Object type.
   */
  private static final String OBJECT_TYPE = "Schedule";

  public static BunqResponse<Schedule> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer scheduleId) {
    return get(apiContext, userId, monetaryAccountId, scheduleId, new HashMap<>());
  }

  /**
   * Get a specific schedule definition for a given monetary account.
   */
  public static BunqResponse<Schedule> get(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Integer scheduleId, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_READ, userId, monetaryAccountId, scheduleId), new HashMap<>(), customHeaders);

    return fromJson(Schedule.class, responseRaw, OBJECT_TYPE);
  }

  public static BunqResponse<List<Schedule>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId) {
    return list(apiContext, userId, monetaryAccountId, new HashMap<>());
  }

  public static BunqResponse<List<Schedule>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params) {
    return list(apiContext, userId, monetaryAccountId, params, new HashMap<>());
  }

  /**
   * Get a collection of scheduled definition for a given monetary account. You can add the
   * parameter type to filter the response. When
   * type={SCHEDULE_DEFINITION_PAYMENT,SCHEDULE_DEFINITION_PAYMENT_BATCH} is provided only
   * schedule definition object that relate to these definitions are returned.
   */
  public static BunqResponse<List<Schedule>> list(ApiContext apiContext, Integer userId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
    ApiClient apiClient = new ApiClient(apiContext);
    BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, userId, monetaryAccountId), params, customHeaders);

    return fromJsonList(Schedule.class, responseRaw, OBJECT_TYPE);
  }

}