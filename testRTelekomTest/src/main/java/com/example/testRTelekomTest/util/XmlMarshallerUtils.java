package com.example.testRTelekomTest.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

public class XmlMarshallerUtils {

    public static <T> T deserialize(String object, Class<T> clasz) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(clasz);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (T) unmarshaller.unmarshal(new StringReader(object));
    }
}
