package com.example.examplestatemachine;

public class StateContext {
    State acceptStateA;
    State acceptStateB;
    State rejectStateA;
    State rejectStateB;
    State rejectStateIni;
    State s;

    public StateContext () {
        this.rejectStateA = new RejectStateA(this);
        this.acceptStateA = new AcceptStateA(this);
        this.rejectStateB = new RejectStateB(this);
        this.acceptStateB = new AcceptStateB(this);
        this.rejectStateIni = new RejectStateIni(this);
        s = rejectStateIni ;
    }

    public void actionA() { s.actionA(); }
    public void actionB() { s.actionB(); }

    public void setState(State newState){ s = newState; }

    public State getAcceptStateA() { return acceptStateA; }
    public State getAcceptStateB() { return acceptStateB; }

    public State getRejectStateA() { return rejectStateA; }
    public State getRejectStateB() { return rejectStateB; }

    public boolean isAccept() { return s.isAccept(); }


}
