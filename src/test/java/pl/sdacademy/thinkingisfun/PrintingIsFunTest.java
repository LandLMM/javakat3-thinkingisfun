package pl.sdacademy.thinkingisfun;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.io.OutputStream;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.never;

@RunWith(MockitoJUnitRunner.class)
public class PrintingIsFunTest {

    @Mock
    private OutputStream output;

    @InjectMocks
    private PrintingIsFun fun;

    @Test
    public void shouldBeAbleToPrint3x5Rectangle() throws IOException {
        fun.printRectangle(3, 5);

        InOrder orderVerifier = inOrder(output);
        orderVerifier.verify(output).write(eq(("***" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("***" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("***" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("***" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("***" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output, never()).write(any());
    }

    @Test
    public void shouldBeAbleToPrint6x3Rectangle() throws IOException {
        fun.printRectangle(6, 3);

        InOrder orderVerifier = inOrder(output);
        orderVerifier.verify(output).write(eq(("******" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("******" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("******" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output, never()).write(any());
    }

    @Test
    public void shouldBeAbleToPrint4x4Rectangle() throws IOException {
        fun.printRectangle(4, 4);

        InOrder orderVerifier = inOrder(output);
        orderVerifier.verify(output).write(eq(("****" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("****" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("****" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("****" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output, never()).write(any());
    }

    @Test
    public void shouldBeAbleToPrint4x6Box() throws IOException {
        fun.printBox(4, 6);

        InOrder orderVerifier = inOrder(output);
        orderVerifier.verify(output).write(eq(("****" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("*  *" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("*  *" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("*  *" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("*  *" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("****" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output, never()).write(any());
    }

    @Test
    public void shouldBeAbleToPrint7x3Box() throws IOException {
        fun.printBox(7, 3);

        InOrder orderVerifier = inOrder(output);
        orderVerifier.verify(output).write(eq(("*******" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("*     *" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("*******" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output, never()).write(any());
    }

    @Test
    public void shouldBeAbleToPrint1x1Box() throws IOException {
        fun.printBox(1, 1);

        InOrder orderVerifier = inOrder(output);
        orderVerifier.verify(output).write(eq(("*" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output, never()).write(any());
    }

    @Test
    public void shouldBeAbleToPrintTriangeBasedOn3() throws IOException {
        fun.printTriangle(3);

        InOrder orderVerifier = inOrder(output);
        orderVerifier.verify(output).write(eq(("***" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("**" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("*" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output, never()).write(any());
    }

    @Test
    public void shouldBeAbleToPrintTriangeBasedOn8() throws IOException {
        fun.printTriangle(8);

        InOrder orderVerifier = inOrder(output);
        orderVerifier.verify(output).write(eq(("********" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("*******" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("******" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("*****" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("****" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("***" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("**" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("*" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output, never()).write(any());
    }

    @Test
    public void shouldBeAbleToPrintTriangeBasedOn1() throws IOException {
        fun.printTriangle(1);

        InOrder orderVerifier = inOrder(output);
        orderVerifier.verify(output).write(eq(("*" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output, never()).write(any());
    }

    @Test
    public void shouldBeAbleToPrintTreeBasedOn4() throws IOException {
        fun.printTree(4);

        InOrder orderVerifier = inOrder(output);
        orderVerifier.verify(output).write(eq(("   *   " + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("  ***  " + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq((" ***** " + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("*******" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output, never()).write(any());
    }

    @Test
    public void shouldBeAbleToPrintTreeBasedOn6() throws IOException {
        fun.printTree(6);

        InOrder orderVerifier = inOrder(output);
        orderVerifier.verify(output).write(eq(("     *     " + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("    ***    " + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("   *****   " + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("  *******  " + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq((" ********* " + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output).write(eq(("***********" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output, never()).write(any());
    }

    @Test
    public void shouldBeAbleToPrintTreeBasedOn1() throws IOException {
        fun.printTree(1);

        InOrder orderVerifier = inOrder(output);
        orderVerifier.verify(output).write(eq(("*" + System.lineSeparator()).getBytes()));
        orderVerifier.verify(output, never()).write(any());
    }

}