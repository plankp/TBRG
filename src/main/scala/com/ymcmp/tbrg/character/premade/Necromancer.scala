package com.ymcmp.tbrg.character.premade

import com.ymcmp.tbrg.character._

/**
  * Created by Plankp on 2016-03-21.
  */
class Necromancer(name: String, gender: Gender.Value, stats: Stats) extends GenericSheet(name, gender,
  stats, () => Dice.d4, 0, 0,
  Array(
    "You blast your enemy with a bolt of darkness.",
    "Using your sacrificial dagger, you carve a deep wound into your enemy's side.",
    "Your cold lifeless hands freeze the blood under your enemy's skin.",
    "You spray the enemy in boiling black tar.",
    "Your gaze burns into the enemy's soul."
  ),
  Array(
    "You summon the hands of minor demons to drag your enemy into the underworld.",
    "You drain the life out of your opponent, leaving him a hollowed corpse.",
    "You inflict the killing wound with your dagger.",
    "Your enemy's soul is taken away by your patron god.",
    "You store your enemy's soul in a bottle, for later."
  ),
  "Having defeated all your enemies, you bend down over each body, collecting the souls before moving on.") {
  hp = 8 + stats.constitution + 3 * (lvl - 1)
  ac = 11 + stats.dexterity

  addSpells(1, Spell("FALSE LIFE", "Your health is double for (your level) turns before returning to what it was before the doubling"))
  addSpells(2, Spell("DARKNESS", "All attacks miss you until your next turn"))
  addSpells(3, Spell("ANIMATE DEAD", "Any people you have killed in this combat come back to life but fight for you"))
  addSpells(4, Spell("DRAIN", "Do a normal attack but gain in hp the damage you inflict on the enemy",
    (hero, enemies) =>
      enemies foreach {
        var atkpts = hero.atk()
        hero.hp += atkpts
        _.hp -= atkpts
      }))
  addSpells(5, Spell("CALL ON PATRON GOD", "One of your enemies is killed by the gods",
    (_, enemies) => enemies(Dice.d(enemies.length) - 1).hp = 0)) // INSTA-KILL!!!
  addSpells(6, Spell("CREATE UNDEAD", "Create a zombie to fight for you"))
  addSpells(7, Spell("ETHEREALNESS", "All damage that would be done to you is done to the attacker. Lasts until your next turn"))
  addSpells(8, Spell("TRAP THE SOUL", "Cause enemy to be unable to attack you until below half health"))
  addSpells(9, Spell("DEATH FOG", "Damages all enemies equal to one attack. If this attack kills, any who are killed return as zombies to help the player"))
}
