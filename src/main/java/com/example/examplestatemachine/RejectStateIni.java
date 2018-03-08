package com.example.examplestatemachine;

public class RejectStateIni extends State {

    StateContext sc;

    public RejectStateIni (StateContext sc) {
        this.sc = sc ;
        this.accept = false;
    }

    @Override
    public void actionA () {
        sc.setState(sc.getAcceptStateA());
    }

    @Override
    public void actionB () {
        sc.setState(sc.getAcceptStateB());
    }
}
