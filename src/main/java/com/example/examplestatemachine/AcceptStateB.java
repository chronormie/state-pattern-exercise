package com.example.examplestatemachine;

public class AcceptStateB extends State{

    StateContext sc;

    public AcceptStateB(StateContext sc) {
        this.sc = sc;
        this.accept = true;
    }

    @Override
    public void actionA () {
        sc.setState(sc.getRejectStateA());
    }
    @Override
    public void actionB () {
        sc.setState(sc.getAcceptStateB());
    }
}
