package com.bunq.sdk.model.generated.endpoint;

import com.bunq.sdk.http.ApiClient;
import com.bunq.sdk.http.BunqResponse;
import com.bunq.sdk.http.BunqResponseRaw;
import com.bunq.sdk.model.core.BunqModel;
import com.google.gson.stream.JsonReader;

import java.util.Map;

/**
 * Fetch the raw content of a monetary account attachment with given ID. The raw content is the
 * binary representation of a file, without any JSON wrapping.
 */
public class AttachmentMonetaryAccountContent extends BunqModel {

    /**
     * Endpoint constants.
     */
    protected static final String ENDPOINT_URL_LISTING = "user/%s/monetary-account/%s/attachment/%s/content";

    /**
     * Object type.
     */
    protected static final String OBJECT_TYPE_GET = "AttachmentMonetaryAccountContent";

    /**
     * Get the raw content of a specific attachment.
     */
    public static BunqResponse<byte[]> list(Integer attachmentId, Integer monetaryAccountId, Map<String, String> params, Map<String, String> customHeaders) {
        ApiClient apiClient = new ApiClient(getApiContext());
        BunqResponseRaw responseRaw = apiClient.get(String.format(ENDPOINT_URL_LISTING, determineUserId(), determineMonetaryAccountId(monetaryAccountId), attachmentId), params, customHeaders);

        return new BunqResponse<>(responseRaw.getBodyBytes(), responseRaw.getHeaders());
    }

    public static BunqResponse<byte[]> list() {
        return list(null, null, null, null);
    }

    public static BunqResponse<byte[]> list(Integer attachmentId) {
        return list(attachmentId, null, null, null);
    }

    public static BunqResponse<byte[]> list(Integer attachmentId, Integer monetaryAccountId) {
        return list(attachmentId, monetaryAccountId, null, null);
    }

    public static BunqResponse<byte[]> list(Integer attachmentId, Integer monetaryAccountId, Map<String, String> params) {
        return list(attachmentId, monetaryAccountId, params, null);
    }

    /**
     *
     */
    public static AttachmentMonetaryAccountContent fromJsonReader(JsonReader reader) {
        return fromJsonReader(AttachmentMonetaryAccountContent.class, reader);
    }

    /**
     *
     */
    public boolean isAllFieldNull() {
        return true;
    }

}
