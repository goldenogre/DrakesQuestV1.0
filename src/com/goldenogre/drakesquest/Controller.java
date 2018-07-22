package com.goldenogre.drakesquest;

//import com.goldenogre.drakesquest.battlesystem.BattleSystem;
import com.goldenogre.drakesquest.battlesystem.BattleSystemV2;
import com.goldenogre.drakesquest.com.goldenogre.music.Music;
import com.goldenogre.drakesquest.data.CreateEnemyGroups;
import com.goldenogre.drakesquest.data.CreateHeroes;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;




public class Controller {
    CreateHeroes party = new CreateHeroes();
    CreateEnemyGroups enemyGroup = new CreateEnemyGroups();
    BattleSystemV2 fight;
//    Music play = new Music();
    @FXML
    private Label hero1,hero2,hero3,hero4,hero1HP,hero2HP,hero3HP,hero4HP;
    @FXML
    private Label enemy1,enemy2,enemy3,enemy4,enemy5,enemy1HP,enemy2HP,enemy3HP,enemy4HP,enemy5HP;
    @FXML
    private Button attackButton;



    public void initialize(){
        fight= new BattleSystemV2(party.getParty(),enemyGroup.getBoss1());

        hero1.setText(party.getParty().get(0).getName());
        hero2.setText(party.getParty().get(1).getName());
        hero3.setText(party.getParty().get(2).getName());

            hero4.setText(party.getParty().get(3).getName());



        hero1HP.setText(String.valueOf(party.getParty().get(0).getHitPoints()));
        hero2HP.setText(String.valueOf(party.getParty().get(1).getHitPoints()));
        hero3HP.setText(String.valueOf(party.getParty().get(2).getHitPoints()));
        hero4HP.setText(String.valueOf(party.getParty().get(3).getHitPoints()));
        enemy1.setText(enemyGroup.getBoss1().get(0).getName());
        enemy2.setText(enemyGroup.getBoss1().get(1).getName());
        enemy3.setText(enemyGroup.getBoss1().get(2).getName());
        enemy4.setText(enemyGroup.getBoss1().get(3).getName());
        enemy5.setText(enemyGroup.getBoss1().get(4).getName());
        enemy1HP.setText(String.valueOf(enemyGroup.getBoss1().get(0).getHitPoints()));
        enemy2HP.setText(String.valueOf(enemyGroup.getBoss1().get(1).getHitPoints()));
        enemy3HP.setText(String.valueOf(enemyGroup.getBoss1().get(2).getHitPoints()));
        enemy4HP.setText(String.valueOf(enemyGroup.getBoss1().get(3).getHitPoints()));
        enemy5HP.setText(String.valueOf(enemyGroup.getBoss1().get(4).getHitPoints()));


    }
    public void setStats(){
        hero1HP.setText(String.valueOf(party.getParty().get(0).getHitPoints()));
        hero2HP.setText(String.valueOf(party.getParty().get(1).getHitPoints()));
        hero3HP.setText(String.valueOf(party.getParty().get(2).getHitPoints()));
        hero4HP.setText(String.valueOf(party.getParty().get(3).getHitPoints()));

        enemy1HP.setText(String.valueOf(enemyGroup.getBoss1().get(0).getHitPoints()));
        enemy2HP.setText(String.valueOf(enemyGroup.getBoss1().get(1).getHitPoints()));
        enemy3HP.setText(String.valueOf(enemyGroup.getBoss1().get(2).getHitPoints()));
        enemy4HP.setText(String.valueOf(enemyGroup.getBoss1().get(3).getHitPoints()));
        enemy5HP.setText(String.valueOf(enemyGroup.getBoss1().get(4).getHitPoints()));

    }
    @FXML
    public void onButtonClicked(ActionEvent e){
        System.out.println("Battle starting.....");
        fight.startAttack();

//

        setStats();




    }
}
