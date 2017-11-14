package de.kuweh.jwt.payload;

import com.google.gson.stream.JsonWriter;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class BooleanFieldTest {

    @Test
    void setValueByConstructor() {
        BooleanField field1 = new BooleanField(true);
        BooleanField field2 = new BooleanField(false);

        try {

            assertTrue(field1.getValue());
            assertFalse(field2.getValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }

    }

    @Test
    void setValue() {

        BooleanField field = new BooleanField();
        field.setValue(true);

        try {
            assertEquals(true, field.getValue());

        } catch (FieldEmptyException e) {
            e.printStackTrace();
        }
    }

    @Test
    void emptyField() {

        BooleanField field = new BooleanField();

        Throwable exception = assertThrows(FieldEmptyException.class, () -> {
            field.getValue();
        });
        assertEquals("No value set!", exception.getMessage());
    }

    @Test
    void testAddValueToJson() throws IOException {

        JsonWriter writer = mock(JsonWriter.class);
        //when(writer.value(anyBoolean())).thenReturn(writer);

        BooleanField field = new BooleanField(true);

        field.addValueToJsonWriter(writer);

        ArgumentCaptor<Boolean> valueCaptor = ArgumentCaptor.forClass(Boolean.class);
        verify(writer, times(1)).value(valueCaptor.capture());

        Boolean value = valueCaptor.getValue();
        assertEquals(true, value);
    }
}