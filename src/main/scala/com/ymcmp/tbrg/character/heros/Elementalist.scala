package com.ymcmp.tbrg.character.heros

import com.ymcmp.tbrg.character._

/**
  * Created by Plankp on 2016-03-21.
  */
class Elementalist(r: Race.Value) extends GenericSheet(r, () => Dice.d6, 0, 0,
  Array(
    "You use your staff and thrust the end into the enemy's stomach.",
    "You form a bubble of acid which you hurl at the enemy, covering him in bubbling, burning, green slime.",
    "You catch your hand ablaze, burning your enemy when you punch him.",
    "You blast a gust of icy wind from your staff.",
    "You shoot a bolt of lightning into the enemy, causing him to shake violently."
  ),
  Array(
    "You form a ball of wind, which you blast through the enemy leaving a hole in the chest.",
    "You call lightning down from the sky, turning your enemy into a pile of ash.",
    "The ground opens up beneath your enemy and you use magic to drag him down into the earth.",
    "You touch your enemy and he freezes into an ice statue, which you proceed to shatter with your staff.",
    "You create a flaming tornado around an enemy, destroying him."
  ),
  "Satisfied with your work, you turn and walk away from your enemies as thunder rolls in the background.",
  Array(
    new Spell("THUNDERWAVE", "Create a large thunder sound causing enemies to miss their next turn"),
    new Spell("MISTY STEP", "If you run next turn you are guaranteed to succeed"),
    new Spell("COUNTERSPELL", "Prevents spells from affecting you until your next turn"),
    new Spell("STONESKIN", "Damage taken is halved for the rest of the round (Does not attack)"),
    new Spell("CLOUDKILL", "Half your health to instantly defeat a random enemy (Use lightning ON KILL)"),
    new Spell("CHAIN LIGHTNING", "Attack as normal except on hit do damage to all enemies(Use lightning ON HIT)"),
    new Spell("FIRESTORM", "Damage an enemy like an attack and prevent all enemies from doing anything on their next turn"),
    new Spell("EARTHQUAKE", "Traps enemies in the earth, allowing your next attack to hit no matter what"),
    new Spell("METEORSWARM", "Do a double damage attack to all enemies and prevent them from using their next turn")
  )) {
  hp = 6 + stats.constitution + 3 * (lvl - 1)
  ac = 13 + stats.dexterity
}