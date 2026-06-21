package com.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyStackTest {

    @Test
    void testPilhaIniciaVazia() {
        MyStack stack = new MyStack();

        assertTrue(stack.isEmpty());
    }

    @Test
    void testPushTornaPilhaNaoVazia() {
        MyStack stack = new MyStack();

        stack.push("A");

        assertFalse(stack.isEmpty());
    }

    @Test
    void testPeekEmPilhaVaziaRetornaNull() {
        MyStack stack = new MyStack();

        assertNull(stack.peek());
    }

    @Test
    void testPopEmPilhaVaziaRetornaNull() {
        MyStack stack = new MyStack();

        assertNull(stack.pop());
    }

    @Test
    void testPushSeguidoDePeekRetornaElementoCorreto() {
        MyStack stack = new MyStack();

        stack.push("A");

        assertEquals("A", stack.peek());
    }

    @Test
    void testPeekNaoRemoveElemento() {
        MyStack stack = new MyStack();

        stack.push("A");

        assertEquals("A", stack.peek());
        assertEquals("A", stack.peek());
        assertFalse(stack.isEmpty());
    }

    @Test
    void testPushSeguidoDePopRetornaElementoCorreto() {
        MyStack stack = new MyStack();

        stack.push("A");

        assertEquals("A", stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testLIFOComDoisElementos() {
        MyStack stack = new MyStack();

        stack.push("A");
        stack.push("B");

        assertEquals("B", stack.pop());
        assertEquals("A", stack.pop());
    }

    @Test
    void testLIFOComTresElementos() {
        MyStack stack = new MyStack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        assertEquals("C", stack.pop());
        assertEquals("B", stack.pop());
        assertEquals("A", stack.pop());
    }

    @Test
    void testPeekRetornaTopoCorreto() {
        MyStack stack = new MyStack();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        assertEquals("C", stack.peek());
    }

    @Test
    void testPopAteEsvaziarPilha() {
        MyStack stack = new MyStack();

        stack.push("A");
        stack.push("B");

        stack.pop();
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    void testPopDepoisDeEsvaziarRetornaNull() {
        MyStack stack = new MyStack();

        stack.push("A");

        stack.pop();

        assertNull(stack.pop());
    }

    @Test
    void testPushNull() {
        MyStack stack = new MyStack();

        stack.push(null);

        assertNull(stack.peek());
    }

    @Test
    void testPopNull() {
        MyStack stack = new MyStack();

        stack.push(null);

        assertNull(stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testSequenciaCompletaOperacoes() {
        MyStack stack = new MyStack();

        stack.push("A");
        stack.push("B");

        assertEquals("B", stack.pop());

        stack.push("C");

        assertEquals("C", stack.pop());
        assertEquals("A", stack.pop());

        assertTrue(stack.isEmpty());
    }
}
