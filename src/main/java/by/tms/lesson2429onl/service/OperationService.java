package by.tms.lesson2429onl.service;

import by.tms.lesson2429onl.model.Operation;

public class OperationService {
    public Operation execute(Operation operation) {
        switch (operation.getType().toUpperCase()) {
            case "SUM":
                operation.setResult(operation.getNam1() + operation.getNam2());
                return operation;
            case "SUB":
                operation.setResult(operation.getNam1() - operation.getNam2());
                return operation;
            case "MUL":
                operation.setResult(operation.getNam1() * operation.getNam2());
                return operation;
            case "DIV":
                operation.setResult(operation.getNam1() / operation.getNam2());
                return operation;
        }
        throw new IllegalArgumentException("by.tms.calculator.model.Operation type not supported");
    }
}
