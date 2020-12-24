# Interpretor
the interpretor part in a compiler 
the interpretor is based on the Pushdown Automaton
s we say before, pushdown automaton is a special kind of automaton that employs a stack for working.

Informal description
The pushdown automaton is very similar to a finite state machine, but with an important difference: the use of an stack.

The processing of the string of a pushdown automaton goes like this:

Reads the current symbol of the input string or tape.
Depending on the read symbol, the top symbol of the stack and the current state where the automaton is placed it takes a decision of which state is going to go.
This process is executing until all the string has been explored or where the stack is empty.
It is important to say that this automaton is nondeterministic, so many transitions should be explored for the same combination of states and symbols.

Formal description
Formally the pushdown automaton is defined as a 7-tuple of elements:

consist on this elements: automaton tuple

Q : finite set of states of the automaton.
Sigma : alphabet of the input tape, which is a finite set of symbols.
tau : alphabet of the stack, which is a finite set of symbols.
q0 : initial state of the automaton.
Z : initial symbol of the alphabet.
F : finite set of accepting states.
delta : Transition function of the automaton.
