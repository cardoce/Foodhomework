/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.RecipeInterface;

/**
 *
 * @author fernandocardoce
 */
public class Recipe implements RecipeInterface {
    TxtReader txtread = new TxtReader();
    @Override
    public String loadRecipe(String recipeName, String foodType) {
       String recipeText = "";
       switch(foodType){
           case "Pasta" : recipeText = pastaRecipe(recipeName);
           break;
           case "Meat" : recipeText = meatRecipe(recipeName);
           break;
           case "Chicken" : recipeText = chickenRecipe(recipeName);
           break;
           case "Dessert" : recipeText = dessertRecipe(recipeName);
           break;
           case "Salad" : recipeText = saladRecipe(recipeName);
           break;
       }
       return recipeText;
    }

    @Override
    public String loadImageURL(String recipeName, String foodType) {
         String recipeURL= "";
       switch(foodType){
           case "Pasta" : recipeURL = pastaURL(recipeName);
           break;
           case "Meat" : recipeURL = meatURL(recipeName);
           break;
           case "Chicken" : recipeURL = chickenURL(recipeName);
           break;
           case "Dessert" : recipeURL = dessertURL(recipeName);
           break;
           case "Salad" : recipeURL = saladURL(recipeName);
           break;
       }
       return recipeURL;
    }

    private String pastaRecipe(String recipeName) {
        String recipeText = "";
        switch(recipeName){
            case  "Lassagna Rolls": recipeText = txtread.txtReader("/Assests/Pasta/lassagnarolls.txt");
            break;
            case "Spaghetti And Meatballs": recipeText = txtread.txtReader("/Assests/Pasta/spagmeatballs.txt");
            break;
            case "Spinach Lasagna" : recipeText = txtread.txtReader("/Assests/Pasta/spinachlas.txt");
            break;
            case "Baked Spaghetti": recipeText = txtread. txtReader("/Assests/Pasta/bakedspag.txt");
            break;
            case "Fettuccine Alfredo": recipeText = txtread.txtReader("/Assests/Pasta/fetalfredo.txt");
            break;
            case "Pasta Fagioli": recipeText = txtread.txtReader("/Assests/Pasta/fagioli.txt");
            break;
            case "Shrimp Alfredo": recipeText = txtread.txtReader("/Assests/Pasta/shrimp.txt");
            break;
            case "Chicken Tetrazzini": recipeText = txtread.txtReader("/Assests/Pasta/tetrazzini.txt");
            break;
        }
        return recipeText;
    }

    private String pastaURL(String recipeName) {
        String recipeURL = "";
        switch(recipeName){
            case  "Lassagna Rolls": recipeURL="/Assests/Pasta/lassagnarolls.jpg";
            break;
            case "Spaghetti And Meatballs": recipeURL = "/Assests/Pasta/Spaghetti And Meatballs.jpg";
            break;
            case "Spinach Lasagna" : recipeURL="/Assests/Pasta/spinach lassagna.jpg";
            break;
            case "Baked Spaghetti": recipeURL ="/Assests/Pasta/baked spagh.jpg";
            break;
            case "Fettuccine Alfredo": recipeURL ="/Assests/Pasta/fett-alfredo.jpg";
            break;
            case "Pasta Fagioli": recipeURL ="/Assests/Pasta/Pasta Fagioli.jpg";
            break;
            case "Shrimp Alfredo": recipeURL ="/Assests/Pasta/shrimp.jpg";
            break;
            case "Chicken Tetrazzini": recipeURL ="/Assests/Pasta/Tetrazzini.jpg";
            break;
        }
        return recipeURL;
    }

    private String meatRecipe(String recipeName) {
         String recipeText = "";
        switch(recipeName){
            case  "Perfect Flank Steak": recipeText = txtread.txtReader("/Assests/Meat/flanksteak.txt");
            break;
            case "Cheesesteak Potato Skins": recipeText = txtread.txtReader("/Assests/Meat/potatoskins.txt");
            break;
            case "Cilantro-Lime Grilled Steak" : recipeText = txtread.txtReader("/Assests/Meat/cilantro.txt");
            break;
            case "Salisbury Steak": recipeText = txtread. txtReader("/Assests/Meat/salisbury.txt");
            break;
            case "Steak Sandwich": recipeText = txtread.txtReader("/Assests/Meat/steaksand.txt");
            break;
            case "Philly Cheesesteak Soup": recipeText = txtread.txtReader("/Assests/Meat/steaksoup.txt");
            break;
            case "Easy Beef Stroganoff": recipeText = txtread.txtReader("/Assests/Meat/strog.txt");
            break;
            case "Mongolian Beef Ramen": recipeText = txtread.txtReader("/Assests/Meat/mongolian.txt");
            break;
        }
        return recipeText;
    }
    
    private String meatURL(String recipeName) {
         String recipeURL = "";
        switch(recipeName){
            case  "Perfect Flank Steak": recipeURL = "/Assests/Meat/flanksteak.jpg";
            break;
            case "Cheesesteak Potato Skins": recipeURL =  "/Assests/Meat/steakpot.jpg";
            break;
            case "Cilantro-Lime Grilled Steak" : recipeURL =  "/Assests/Meat/cilantrosteak.jpg";
            break;
            case "Salisbury Steak": recipeURL =  "/Assests/Meat/salisbury.jpg";
            break;
            case "Steak Sandwich": recipeURL =  "/Assests/Meat/steaksandw.jpg";
            break;
            case "Philly Cheesesteak Soup": recipeURL=  "/Assests/Meat/steaksoup.jpg";
            break;
            case "Easy Beef Stroganoff": recipeURL =  "/Assests/Meat/strog.jpg";
            break;
            case "Mongolian Beef Ramen": recipeURL=  "/Assests/Meat/mong.jpg";
            break;
        }
        return recipeURL;
    }

    private String chickenURL(String recipeName) {
        String recipeURL = "";
        switch(recipeName){
            case  "Jerk Chicken": recipeURL = "/Assests/Chicken/jerkchicken.jpg";
            break;
            case "Grilled Chicken": recipeURL = "/Assests/Chicken/grilledchk.jpg";
            break;
            case "Chicken Zucchini Alfredo" : recipeURL = "/Assests/Chicken/chkzuchinni.jpg";
            break;
            case "Garlicky Greek Chicken": recipeURL = "/Assests/Chicken/greekchk.jpg";
            break;
            case "Cajun Stuffed Chicken": recipeURL = "/Assests/Chicken/cajunchk.jpg";
            break;
            case "Buffalo Skillet Chicken": recipeURL = "/Assests/Chicken/chkskl.jpg";
            break;
            case "Lemon Chicken": recipeURL = "/Assests/Chicken/lemonchk.jpg";
            break;
            case "Coconut Curry Chicken": recipeURL = "/Assests/Chicken/currychk.jpg";
            break;
        }
        return recipeURL;
    }

    private String chickenRecipe(String recipeName) {
        String recipeText = "";
        switch(recipeName){
            case  "Jerk Chicken": recipeText = txtread.txtReader("/Assests/Chicken/jerkchicken.txt");
            break;
            case "Grilled Chicken": recipeText = txtread.txtReader("/Assests/Chicken/grilledchk.txt");
            break;
            case "Chicken Zucchini Alfredo" : recipeText = txtread.txtReader("/Assests/Chicken/chkzuchinni.txt");
            break;
            case "Garlicky Greek Chicken": recipeText = txtread. txtReader("/Assests/Chicken/greekchk.txt");
            break;
            case "Cajun Stuffed Chicken": recipeText = txtread.txtReader("/Assests/Chicken/cajunchk.txt");
            break;
            case "Buffalo Skillet Chicken": recipeText = txtread.txtReader("/Assests/Chicken/chkskl.txt");
            break;
            case "Lemon Chicken": recipeText = txtread.txtReader("/Assests/Chicken/lemonchk.txt");
            break;
            case "Coconut Curry Chicken": recipeText = txtread.txtReader("/Assests/Chicken/currychk.txt");
            break;
        }
        return recipeText;
    }

    private String dessertRecipe(String recipeName) {
        String recipeText = "";
        switch(recipeName){
            case  "Chocolate Chip Cookies": recipeText = txtread.txtReader("/Assests/Dessert/cookies.txt");
            break;
            case "Brownies": recipeText = txtread.txtReader("/Assests/Dessert/brownies.txt");
            break;
            case "Peanut Butter Stuffed Apples" : recipeText = txtread.txtReader("/Assests/Dessert/apples.txt");
            break;
            case "Marshmallow Crunch Brownies": recipeText = txtread. txtReader("/Assests/Dessert/mashbrownies.txt");
            break;
            case "Chocolate PB Banana Bites": recipeText = txtread.txtReader("/Assests/Dessert/banana.txt");
            break;
            case "Carrot Cake": recipeText = txtread.txtReader("/Assests/Dessert/carrotcake.txt");
            break;
            case "Cheesecake Bark": recipeText = txtread.txtReader("/Assests/Dessert/cheesecake.txt");
            break;
            case "Watermelon Ice Cream": recipeText = txtread.txtReader("/Assests/Dessert/watermelon.txt");
            break;
        }
        return recipeText;
    }

    private String dessertURL(String recipeName) {
        String recipeURL= "";
        switch(recipeName){
            case  "Chocolate Chip Cookies": recipeURL = "/Assests/Dessert/cookies.jpg";
            break;
            case "Brownies": recipeURL= "/Assests/Dessert/brownies.jpg";
            break;
            case "Peanut Butter Stuffed Apples" : recipeURL= "/Assests/Dessert/apples.jpg";
            break;
            case "Marshmallow Crunch Brownies": recipeURL = "/Assests/Dessert/mashbrownies.jpg";
            break;
            case "Chocolate PB Banana Bites": recipeURL = "/Assests/Dessert/banana.jpg";
            break;
            case "Carrot Cake": recipeURL = "/Assests/Dessert/carrotcake.jpg";
            break;
            case "Cheesecake Bark": recipeURL = "/Assests/Dessert/cheesecake.jpg";
            break;
            case "Watermelon Ice Cream": recipeURL ="/Assests/Dessert/watermelon.jpg";
            break;
        }
        return recipeURL;
    }

    private String saladRecipe(String recipeName) {
        String recipeText = "";
        switch(recipeName){
            case  "Santa Fe Chicken Salad": recipeText = txtread.txtReader("/Assests/Salad/santafe.txt");
            break;
            case "Guacamole Salad": recipeText = txtread.txtReader("/Assests/Salad/guacamole.txt");
            break;
            case "Greek Salad" : recipeText = txtread.txtReader("/Assests/Salad/greek.txt");
            break;
            case "Harvest Cobb Salad": recipeText = txtread. txtReader("/Assests/Salad/harvestcobb.txt");
            break;
            case "Shrimp Taco Salad": recipeText = txtread.txtReader("/Assests/Salad/shrimpsalad.txt");
            break;
            case "Steak Taco Salad": recipeText = txtread.txtReader("/Assests/Salad/tacosalad.txt");
            break;
            case "Kale Caesar Salad": recipeText = txtread.txtReader("/Assests/Salad/kalecesar.txt");
            break;
            case "Quinoa Salad": recipeText = txtread.txtReader("/Assests/Salad/quinoa.txt");
            break;
        }
        return recipeText;
    }

    private String saladURL(String recipeName) {
        String recipeURL = "";
        switch(recipeName){
            case  "Santa Fe Chicken Salad": recipeURL = "/Assests/Salad/santafe.jpg";
            break;
            case "Guacamole Salad": recipeURL = "/Assests/Salad/guacamole.jpg";
            break;
            case "Greek Salad" : recipeURL = "/Assests/Salad/greek.jpg";
            break;
            case "Harvest Cobb Salad": recipeURL = "/Assests/Salad/harvestcobb.jpg";
            break;
            case "Shrimp Taco Salad": recipeURL = "/Assests/Salad/shrimpsalad.jpg";
            break;
            case "Steak Taco Salad": recipeURL = "/Assests/Salad/tacosalad.jpg";
            break;
            case "Kale Caesar Salad": recipeURL = "/Assests/Salad/kalecesar.jpg";
            break;
            case "Quinoa Salad": recipeURL = "/Assests/Salad/quinoa.jpg";
            break;
        }
        return recipeURL;
    }
    
   
    
}
