player1 = input("Enter the name of player 1: ")
player2 = input("Enter the name of player 2: ")
print("Its a Rock, paper and scissor game !!!!")
player1_choice = input("Enter the move: ")

player2_choice = input("Enter the move: ")

def rock_paper_scissors(player1_choice , player2_choice):
    player1  = player1_choice.lower()
    player2 = player2_choice.lower()

    # valid choices
    valid_choices = ["rock", "paper", "scissors"]

    if player1 not in valid_choices or player2 not in valid_choices:
        return "Invalid choice! Choose rock, paper, or scissors."

    if player1 == player2:
        return "It's a Tie!"

    if (
        (player1 == "rock" and player2 == "scissors") or
        (player1 == "scissors" and player2 == "paper") or
        (player1 == "paper" and player2 == "rock")
    ):
        return "Player 1 Wins!"
    else:
        return "Player 2 Wins!"

result = rock_paper_scissors(player1_choice,player2_choice)
print(result)


while True:
    player1_choice = input("Enter the move: ")
    player2_choice = input("Enter the move: ")

    result = rock_paper_scissors(player1_choice, player2_choice)
    print(result)

    play_again = input("Do you want to play again? (yes/no): ").lower()

    if play_again != "yes":
        print("Game Over. Thanks for playing!")
        break