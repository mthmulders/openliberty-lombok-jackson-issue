package io.github.mthmulders;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateAdapter extends XmlAdapter<String, LocalDate> {
    @Override
    public LocalDate unmarshal(final String input) throws Exception {
        return LocalDate.parse(input, DateTimeFormatter.ISO_DATE);
    }

    @Override
    public String marshal(final LocalDate date) throws Exception {
        return DateTimeFormatter.ISO_DATE.format(date);
    }
}
