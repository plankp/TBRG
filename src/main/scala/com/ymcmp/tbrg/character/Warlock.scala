package com.ymcmp.tbrg.character

/**
  * Created by Plankp on 2016-03-21.
  */
class Warlock(r: Race.Value) extends GenericSheet(r, () => Dice.d6, 0, 0,
  Array(
    "Demonic flames coat your enemy.",
    "Your dark curved blade cuts cleanly through your enemy's flesh.",
    "You begin to corrupt your enemy through dark magic.",
    "You set you blade alight and sear your enemy's flesh.",
    "Your hands burn your foe as you viciously tear at his skin."
  ),
  Array(
    "Your patron is happy to receive another soul.",
    "You thrust your blade through the gut of your enemy, killing him.",
    "Off with your enemy's head!",
    "The fire consumes your foe, leaving only ash.",
    "Demonic hands pull your enemy into the ground."
  ),
  "You look at the death you caused. Your patron demon will be happy.",
  Array(
    new Spell("HELLISH ARMOUR", "Any damage dealt to you after using this spell is reduced by 1 and 1 damage is done to your attacker."),
    new Spell("DARKNESS", "All attacks miss you until your next turn"),
    new Spell("RAY OF MADNESS:", "On a successful hit, one of the enemies will randomly attack your team or the enemy on his turn"),
    new Spell("DRAIN", "Do a normal attack but gain in hp the damage you inflict on the enemy"),
    new Spell("CALL ON PATRON GOD", "One of your enemies is killed by the gods"),
    new Spell("BLIGHT", "Deal 2 damage every turn to an enemy until you die, it dies, or 5 of your turns have passed"),
    new Spell("GAS FORM", "You are immune to damage until you attack"),
    new Spell("TRAP THE SOUL", "Cause enemy to be unable to attack you until below half health"),
    new Spell("DEMONBLADE", "Make your weapon inflict twice as much damage and inflict blight on hit. Does not stack.")
  )) {
  hp = 8 + stats.constitution + 4 * (lvl - 1)
  ac = 11 + stats.dexterity
}