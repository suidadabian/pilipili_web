package com.pilipili.model;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.pilipili.model.base.BaseLightPicture;

import java.io.IOException;
import java.io.StringReader;
import java.util.Date;

/**
 * Generated by JFinal.
 */
@SuppressWarnings("serial")
public class LightPicture extends BaseLightPicture<LightPicture> {
    public static final String ID = "id";
    public static final String USER_ID = "userId";
    public static final String URL = "url";
    public static final String DATE = "date";
    public static final String SHARE = "share";
    public static final String SCALE = "scale";
    public static final String DELETEHASH = "deletehash";

    public static final int SHARE_TRUE = 1;
    public static final int SHARE_FALSE = 0;

    public static final LightPicture dao = new LightPicture().dao();

    public static JsonWriter toJson(LightPicture lightPicture, JsonWriter jsonWriter) throws IOException {
        if (lightPicture == null || jsonWriter == null) {
            return jsonWriter;
        }

        return jsonWriter.beginObject()
                .name(ID).value(lightPicture.getId())
                .name(USER_ID).value(lightPicture.getUserId())
                .name(URL).value(lightPicture.getUrl())
                .name(DATE).value(lightPicture.getDate().getTime())
                .name(SHARE).value(lightPicture.getShare() == SHARE_TRUE ? true : false)
                .name(SCALE).value(lightPicture.getScale())
                .name(DELETEHASH).value(lightPicture.getDeletehash())
                .endObject();
    }

    public static LightPicture fromJson(String json) throws IOException {
        if (json == null) {
            return null;
        }

        LightPicture lightPicture = new LightPicture();
        JsonReader jsonReader = new JsonReader(new StringReader(json));

        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            switch (jsonReader.nextName()) {
                case ID: {
                    lightPicture.setId(jsonReader.nextLong());
                    break;
                }
                case USER_ID: {
                    lightPicture.setUserId(jsonReader.nextLong());
                    break;
                }
                case URL: {
                    lightPicture.setUrl(jsonReader.nextString());
                    break;
                }
                case DATE: {
                    if (jsonReader.peek() == JsonToken.NULL) {
                        jsonReader.nextNull();
                        lightPicture.setDate(null);
                    } else {
                        lightPicture.setDate(new Date(jsonReader.nextLong()));
                    }
                    break;
                }
                case SHARE: {
                    lightPicture.setShare(jsonReader.nextBoolean() ? SHARE_TRUE : SHARE_FALSE);
                    break;
                }
                case SCALE: {
                    lightPicture.setScale((float) jsonReader.nextDouble());
                    break;
                }
                case DELETEHASH: {
                    lightPicture.setDeletehash(jsonReader.nextString());
                    break;
                }
                default: {
                    jsonReader.skipValue();
                    break;
                }
            }
        }
        jsonReader.endObject();
        jsonReader.close();

        return lightPicture;
    }
}
