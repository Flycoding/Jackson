package com.flyingh.vo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Flyingh on 2016/4/20.
 */
public class DateDeserializer extends JsonDeserializer<Date> {
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date deserialize(final JsonParser p, final DeserializationContext ctxt) throws IOException, JsonProcessingException {
        try {
            return format.parse(p.getText());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
