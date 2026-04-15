package it.unibo.javacrush.model.impl;

import it.unibo.javacrush.common.CellType;
import it.unibo.javacrush.model.api.Cell;

public class CellImpl implements Cell{

    private final CellType type;

    public CellImpl(CellType type) {
        this.type = type;
    }

    @Override
    public CellType getType() {
        return this.type;
    }

    public String toString() {
           return "Cell[" + this.type + "]";
    }

}
