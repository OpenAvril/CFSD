package independent;
import independent.praise_sets.Algorithm_praise0;
import independent.praise_sets.Algorithm_praise1;
import independent.praise_sets.Algorithm_praise2;
import independent.praise_sets.Algorithm_praise3;
public class Algorithm_Control
{
    public Algorithm_Control()
    {

    }
    public void SelectSetAlgorithmsubset(Algorithm objAlgorithm, User_Algorithm objUserAlgorithm, long praiseId)
    {
        switch((int) praiseId)
        {
            case 0:
                Algorithm_praise0 inputPraise0 = (Algorithm_praise0)objAlgorithm.dyn_REG_get_Algorithmsubset();
                objAlgorithm.dyn_REG_set_Algorithmsubset(inputPraise0);
                break;

            case 1:
                Algorithm_praise1 inputPraise1 = (Algorithm_praise1)objAlgorithm.dyn_REG_get_Algorithmsubset();
                objAlgorithm.dyn_REG_set_Algorithmsubset(inputPraise1);
                break;

            case 2:
                Algorithm_praise2 inputPraise2 = (Algorithm_praise2)objAlgorithm.dyn_REG_get_Algorithmsubset();
                objAlgorithm.dyn_REG_set_Algorithmsubset(inputPraise2);
                break;

            case 3:
                Algorithm_praise3 inputPraise3 = (Algorithm_praise3)objAlgorithm.dyn_REG_get_Algorithmsubset();
                objAlgorithm.dyn_REG_set_Algorithmsubset(inputPraise3);
                break;
        }
    }
}
