package com.ymcmp.tbrg.character

/**
  * Created by Plankp on 2016-03-21.
  */
class PhaseKnight(r: Race.Value) extends GenericSheet(r, () => Dice.d12, 0, 0,
  Array(
    "Your blades tear through the enemy's armour.",
    "You smash the enemy's head with the handle of your swords.",
    "Your strike cripples the enemy.",
    "Using magic, you are able to confuse the enemy into attacking himself.",
    "Your enemy is getting rekt by you."
  ),
  Array(
    "Your enemy has been dominated.",
    "Your illusions drove your enemy to insanity. He can no longer fight.",
    "Your blades act like scissors, cutting your foe's neck.",
    "Using smoke you get behind your enemy and run him through.",
    "Your blades shred your enemy to pieces."
  ),
  "A puff of magic and your blades are cleaned, ready for the next fight.",
  Array(
    new Spell("SMOKE", "Your enemy cannot hit you until your next turn"),
    new Spell("INVISIBILITY", "Enemies cannot hit you until your next turn. If you attack on your next turn it is guaranteed to hit."),
    new Spell("MISLEAD", "Make the enemies attack other enemies until your next turn"),
    new Spell("PROJECT COPY", "Enemies who would hit you hit your copy 50% of the time. Copy lasts for 3 of your turns."),
    new Spell("Phase", "If you would be hit by an attack after casting this spell you do not take damage and receive the opportunity to attack the enemy who would have hit you. Lasts for two of your turns")
  )) {
  hp = 10 + stats.constitution + 4 * (lvl - 1)
  ac = 16
}