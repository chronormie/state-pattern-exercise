package com.example.examplestatemachine;

public class RejectStateA extends State {

    StateContext sc;

    public RejectStateA (StateContext sc) {
        this.sc = sc;
        this.accept = false;
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
