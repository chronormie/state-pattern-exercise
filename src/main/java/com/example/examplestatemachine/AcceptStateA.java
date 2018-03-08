package com.example.examplestatemachine;

public class AcceptStateA extends State {

    StateContext sc;

    public AcceptStateA(StateContext sc) {
        this.sc = sc;
        this.accept = true;
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
