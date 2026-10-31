package independent.praise_sets;

public class Algorithm_praise2
{
    public Algorithm_praise2()
    {

    }
    public double doWork(Input_praise2 subsetIn, Output_praise2 subsetOut)
    {
        subsetOut.dyn_REG_set_output_praise2_value((subsetIn.dyn_REG_get_input_praise2_valueA() + subsetIn.dyn_REG_get_input_praise2_valueB()));
        return subsetOut.dyn_REG_get_output_praise2_value();
    }
}
