package body ComplexNumbers is
    function Addition (Num1, Num2: in Float) return Float is
    sum: Float;
    begin
        sum := Num1 + Num2;
        return sum;
    end Addition;
    
    function Subtraction (Num1, Num2: in Float) return Float is
    difference: Float;
    begin
        difference := Num1 - Num2;
        return difference;
    end Subtraction;
    
    function Multiplication (Num1, Num2: in Float) return Float is
    product: Float;
    begin
        product := Num1 * Num2;
        return product;
    end Multiplication;
    
    function Division (Num1, Num2: in Float) return Float is
    quotient: Float;
    begin
        quotient := Num1 / Num2;
        return quotient;
    end Division;
    
end ComplexNumbers;