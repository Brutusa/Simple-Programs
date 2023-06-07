with Ada.Text_IO; use Ada.Text_IO;
with Ada.Integer_Text_IO; use Ada.Integer_Text_IO;
with Ada.Float_Text_IO; use Ada.Float_Text_IO;
with ComplexNumbers; use ComplexNumbers;

procedure Main is
   Num1 : Float;
   Num2 : Float;
   Input : Integer;
   Output : Float;
begin
   Put_Line("Enter two numbers: ");
   Put_Line("First Number: ");
   Get (Num1);
   
   Put_Line("Second Number: ");
   Get (Num2);
   Put_Line("Select operation");
   Put_Line("1) Addition:");
   Put_Line("2) Subtraction: ");
   Put_Line("3) Multiplication");
   Put_Line("4) Division");
   Get (Input);
     
   if Input = 1 then
      Output := Addition (Num1, Num2);
   elsif Input = 2 then
      Output := Subtraction (Num1, Num2);
   elsif Input = 3 then
      Output := Multiplication (Num1, Num2);
   elsif Input = 4 then
      Output := Division (Num1, Num2);
   end if;
   Put ("You get ");
   Put (Output);
end Main;