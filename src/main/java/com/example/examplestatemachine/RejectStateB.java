package com.example.examplestatemachine;

public class RejectStateB extends State {
    StateContext sc;

    public RejectStateB (StateContext sc) {
        this.sc = sc ;
        this.accept = false;
    }

    @Override
    public void actionA () {
        sc.setState(sc.getAcceptStateA());
    }
    @Override
    public void actionB () {
        sc.setState(sc.getRejectStateB());
    }
}
