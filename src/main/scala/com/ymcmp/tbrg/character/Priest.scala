package com.ymcmp.tbrg.character

/**
  * Created by Plankp on 2016-03-21.
  */
class Priest(r: Race.Value) extends GenericSheet(r, () => Dice.d4, 0, 0,
  Array(
    "You stab your enemy with your wooden stake.",
    "You blast your enemy with the power of the sun.",
    "Your divine purpose slowly eats away at your enemy's moral.",
    "Your foe is smashed by thine divine power.",
    "You blind your enemy with a ball of pure light."
  ),
  Array(
    "Your enemy has been vanquished.",
    "Your stake embedded itself into your enemy's heart.",
    "The sun burns your enemy to a crisp.",
    "Another one bites the dust.",
    "Your enemy is engulfed by the light."
  ),
  "After all your foes are defeated you recite a prayer for the dead before leaving.",
  Array(
    new Spell("HEAL", "Gain 1-4 health. Cannot go above starting health"),
    new Spell("LIGHT", "All attacks miss you until your next turn"),
    new Spell("SHIELD OF FAITH", "Your next turn is skipped but you are protected against normal attacks until your next turn (not counting the skipped one)"),
    new Spell("SPIRITUAL WEAPON", "Your normal attacks do double the damage for the next 1-4 turns"),
    new Spell("CALL ON PATRON GOD", "One of your enemies is killed by the gods"),
    new Spell("SPIRIT GUARDIAN", "Summon a guardian with 8 health that will take damage for you until it is killed"),
    new Spell("ETHEREALNESS", "All damage that would be done to you is done to the attacker. Lasts until your next turn"),
    new Spell("MASS HEAL", "Heal yourself and all allies by 1-6 health. Cannot go above starting health"),
    new Spell("REVIVAL", "If you die after using this spell you are brought back to full health. Works once after use")
  )) {
  hp = 8 + stats.constitution + 4 * (lvl - 1)
  ac = 14 + stats.dexterity
  if (ac > 16) // Max of 16
    ac = 16
}