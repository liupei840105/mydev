package com.gov.train.common.convertor;

import org.jooq.Converter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by liupei on 2017/8/1.
 */
public class DateTimeConvertor implements Converter<Timestamp, LocalDateTime> {
    @Override
    public LocalDateTime from(Timestamp timestamp) {
        if (timestamp != null) {
            return timestamp.toLocalDateTime();
        }
        return null;
    }

    @Override
    public Timestamp to(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return Timestamp.valueOf(localDateTime);
        }
        return null;
    }

    @Override
    public Class<Timestamp> fromType() {
        return Timestamp.class;
    }

    @Override
    public Class<LocalDateTime> toType() {
        return LocalDateTime.class;
    }
}
