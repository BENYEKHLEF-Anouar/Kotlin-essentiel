# Kotlin — Classe normale vs Data Class

## Vue d’ensemble

En Kotlin, il existe deux façons principales de définir une classe :
- Une **classe normale** (`class`)
- Une **data class** (`data class`)

Elles se ressemblent syntaxiquement, mais se comportent très différemment en ce qui concerne **l’égalité**, la **représentation sous forme de chaîne**, la **copie** et la **déstructuration**.

---

## Résumé conceptuel

| Fonctionnalité | `class` (normale) | `data class` |
|----------------|------------------|---------------|
| Méthodes générées automatiquement | Aucune | `equals`, `hashCode`, `toString`, `copy`, `componentN` |
| Égalité (`==`) | Compare les **références** (même objet en mémoire) | Compare le **contenu** (valeurs du constructeur primaire) |
| `toString()` | Par défaut depuis `Any` (illisible) | Lisible, affiche les noms et valeurs des propriétés |
| `copy()` | ❌ Non disponible | ✅ Générée automatiquement |
| Déstructuration | ❌ Non | ✅ Oui (`componentN()`) |
| Usage typique | Objets avec **comportement** | Objets représentant des **données/valeurs** |
| Comportement dans `Set`/`Map` | Objets “égaux visuellement” ≠ égaux en mémoire | Données égales → une seule entrée |

---

