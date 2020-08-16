# Recursion-and-BackTracking



General Backtracking psuedocode-
boolean solve(Node n) {
            if n is a goal node, return true
            
            foreach option O possible from n {
                if solve(O) succeeds, return true
            }
            return false
        }
