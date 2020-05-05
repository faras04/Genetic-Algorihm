package algorithmegenetique.PVC;

import algorithmegenetique.IGene;

// Genes pour le voyageur de commerce
class PVCGene implements IGene {
    protected int villeIndex;
    
    // Constructeurs
    public PVCGene(int _villeIndex) {
        villeIndex = _villeIndex;
    }
    public PVCGene(PVCGene g) {
        villeIndex = g.villeIndex;
    }
    
    // Distance entre ce gene et un autre
    protected int getDistance(PVCGene g) {
        return PVC.getDistance(villeIndex, g.villeIndex);
    }
    
    // Mutation : impossible ici
    @Override
    public void Muter() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    // Affichage
    public String toString() {
        return PVC.getVille(villeIndex);
    }
}
