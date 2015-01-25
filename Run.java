/**
 * Copyright (c) 2014 Magdalen Berns <m.berns@ed.ac.uk>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>
 *
 */

class Run {

  public static void main(String[] args) {

  if(args.length == 2) {

    double k = 1.0;
    int size = Integer.parseInt(args[0]);
    double T = Double.parseDouble(args[1]);
    double beta = (1.0 /(k * T));
    DrawLattice draw = new DrawLattice(size, beta);

    draw.runMetropolis();
    }
  else {
    System.out.println("\n *** Warning *** Wrong number of Arguments\n\nUsage:\n");
    System.out.println("java Run $size $temperature\n");
  }
  }
}

