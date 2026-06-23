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

        stack.push("Livro Java");

        assertFalse(stack.isEmpty());
    }

    @Test
    void testPopEmPilhaVaziaRetornaNull() {
        MyStack stack = new MyStack();

        assertNull(stack.pop());
    }

    @Test
    void testPushSeguidoDePeekRetornaElementoCorreto() {
        MyStack stack = new MyStack();

        stack.push("Livro Java");

        assertEquals("Livro Java", stack.peek());
    }

    @Test
    void testPeekEmPilhaVaziaRetornaNull() {
        MyStack stack = new MyStack();

        assertNull(stack.peek());
    }

    @Test
    void testPushSeguidoDePopRetornaElementoCorreto() {
        MyStack stack = new MyStack();

        stack.push("Livro Java");

        assertEquals("Livro Java", stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testLIFOComTresElementos() {
        MyStack stack = new MyStack();

        stack.push("Livro Java");
        stack.push("Livro Banco de Dados");
        stack.push("Livro Estrutura de Dados");

        assertEquals("Livro Estrutura de Dados", stack.pop());
        assertEquals("Livro Banco de Dados", stack.pop());
        assertEquals("Livro Java", stack.pop());
    }

    @Test
    void testPopAteEsvaziarPilha() {
        MyStack stack = new MyStack();

        stack.push("Livro Java");
        stack.push("Livro Banco de Dados");

        stack.pop();
        stack.pop();

        assertTrue(stack.isEmpty());
    }

    @Test
    void testPopDepoisDeEsvaziarRetornaNull() {
        MyStack stack = new MyStack();

        stack.push("Livro Java");

        stack.pop();

        assertNull(stack.pop());
    }

    @Test
    void testSequenciaCompletaOperacoes() {
        MyStack stack = new MyStack();

        stack.push("Livro Java");
        stack.push("Livro Banco de Dados");

        assertEquals("Livro Banco de Dados", stack.pop());

        stack.push("Livro Estrutura de Dados");

        assertEquals("Livro Estrutura de Dados", stack.pop());
        assertEquals("Livro Java", stack.pop());

        assertTrue(stack.isEmpty());
    }
}
