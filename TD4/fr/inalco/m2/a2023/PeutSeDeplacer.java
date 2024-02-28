package fr.inalco.m2.a2023;

/**
 * Interface que doit implémenter tout object pouvant se déplacer
 * dans un espace à deux dimensions.
 */

public interface PeutSeDeplacer {
  /**
   * @param dX déplacement sur l'axe des abscises
   * @param dY déplacement sur l'axe des ordonnées
   */
  public void deplace(int dX, int dY); 
}
